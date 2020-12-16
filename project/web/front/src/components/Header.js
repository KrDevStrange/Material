import React, {Component} from "react";
import headerLogo from "../image/linkedin_banner_image_1.png";


class Header extends Component {
    render() {
        const headStyle = {
            backgroundColor: "#47555e",
            position: "fixed",
            width : '100%',
            textAlign: "center"
        }

        const headLogo = {
            backgroundColor: "#47555e",
            width: "200px",

        }

        return (
            <div className={Header} style={headStyle}>

                    <img className={headLogo} style={headLogo} src={headerLogo} alt={"MainHeaderLogo"}/>

            </div>
        )
    }
}

export default Header;