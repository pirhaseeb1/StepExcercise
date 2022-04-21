/// <reference types="cypress" />
import LoginPage from '../StepEx/loginPage'
import NavTabs from '../StepEx/NavTabs'

    it("Login with valid credentials and Navigate the Step tabs", function () {
        const login = new LoginPage();
        login.navigate();
        login.login_username('admin');
        login.login_pswd('init');
        login.login_click();
        const ntab = new NavTabs();
        ntab.gotoTab("Keywords");
        ntab.gotoTab("Parameters");
        ntab.gotoTab("Executions");
        ntab.gotoTab("Scheduler");
        ntab.gotoTab("Grid");
        ntab.gotoTab("Admin");

});
 