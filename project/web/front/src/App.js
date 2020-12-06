import React,{ Component } from "react";
import { Route } from "react-router-dom";
import { Logins, SignUp } from "./pages/PageIndex";

class App extends Component {
    render() {
        return (
            <div>
                <Route exact path="/" component={Logins} />
                <Route exact path="/signup" component={SignUp} />
            </div>
        )
    }
}

export default App;

