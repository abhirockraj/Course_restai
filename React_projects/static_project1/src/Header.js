import React from 'react';
import logo from './react_logo.png';
export default function Header(){
    return(
            <header className="outer">
                <nav className="nav">
                    <div className="logo_top1">
                    <img src={logo} className="nav-logo"></img>
                    <h3 className="top1">ReactFacts</h3>
                    </div>
                    <h3 className="top2">React Course - Project 1</h3>
                </nav> 
            </header>
    )
};