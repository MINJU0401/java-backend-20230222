import{ useRef, useState } from 'react'
import NaverInput from '../../component/inputComponent';
import NaverFind from '../../component/FindComponent';

const FIND_LIST = [
    {
        title: '비밀번호 찾기',
        link: 'https://nid.naver.com/user2/api/route?m=routePwInquiry&amp;lang=ko_KR',
    },
    {
        title: '아이디 찾기',
        link: 'https://nid.naver.com/user2/api/route?m=routeIdInquiry&amp;lang=ko_KR',
    },
    {
        title: '회원가입',
        link: 'https://nid.naver.com/user2/V2Join?m=agree&lang=ko_KR',
    },
]

export default function Main() {
    const formRef = useRef<HTMLFormElement | null>(null);
    /* 상수로 선언 해주고, 상태를 바꿀때는 해당 메서드 적용 */
    const [id, setId] = useState<string>("");
    const [password, setPassword] = useState<string>('');
    const [isIdCheck, setIdCheck] = useState<boolean>(false);         /* <> 제너릭으로 타입 지정, ()소괄호 안에 초기값 지정 */
  
    const onSubmitHandler = () => {
      if (!id.trim()) {
        setIdCheck(true);
        return;
      }
      setIdCheck(false);

      if (formRef) formRef.current?.submit();               /* ? : ?의 앞에있는 값이 null이나 undefined가 아닐때 뒤에있는 메서드를 실행 */
      // if (formRef.current) formRef.current.submit();        /* 위 코드와 동일하게 사용 가능 */
    };
  
    return (
    <div className="main">
    <div className="content">
        <div className="sign-in-wrapper">
        <form
            ref={formRef}
            id="form"
            action="https://nid.naver.com/nidlogin.login"
            method="POST"
        >
            <ul className="panel-wrapper">
            <li className="panel-item">
                <div className="panel-inner">
                <div className="id-password-wrapper">
                    
            <NaverInput label="아이디" type="text" name="id" maxLength={41} iconClass="icon-id" setter={setId} />
            <NaverInput label="비밀번호" type="password" name="pw" maxLength={16} iconClass="icon-pw" setter={setPassword} />

            </div>
            <div className="sign-in-keep-wrapper">
                <div className="keep-check">
                <input type="checkbox"
                    className="input-keep"
                    value="off"
                />
                <label className="keep-text">
                    로그인 상태 유지
                </label>
                </div>
                <div className="ip-check"></div>
            </div>

            {isIdCheck && (
                <div id="sign-in-error" className="sign-in-error"
                >
                <div className="error-message">
                    <strong>아이디</strong>를 입력하세요.
                </div>
                </div>
            )}
  
        <div className="sign-in-button-wrapper">
            <button type="button"
            className="sign-in-button"
            onClick={() => onSubmitHandler()}
            >
            <span className="button-text">로그인</span>
            </button>
            </div>
            </div>
            </li>
            </ul>
            </form>
          </div>
          <ul className="find-wrapper">
            {
             FIND_LIST.map((findItem) => (<NaverFind title={findItem.title} link={findItem.link} />))
            }
          </ul>
          <div className="banner-wrapper">
            <div className="banner-content">
              <img className="banner-img" src="https://ssl.pstatic.net/melona/libs/1378/1378592/b3b27f5a48c19f04e111_20230331172904409.jpg" />
            </div>
          </div>
        </div>
      </div>
    );
}
