import { useRef, useState, Dispatch, SetStateAction } from 'react';
import './naver-sign-in.css';

import Header from "./view/HeaderView";
import Footer from "./view/FooterView";
import Main from "./view/MainView";

//* App.tsx
//* tsx : typescript XML(XHTML)
//* 컴포넌트로 인식하게하려면 대문자로 시작


function App() {



  return (
    <>
    <Header />
    <Main />
    <Footer />
    </>
  );
}

export default App;
