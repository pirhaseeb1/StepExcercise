/// <reference types="cypress" />
import LoginPage from '../StepEx/loginPage'
import NavTabs from '../StepEx/NavTabs'

    it("Login with valid credentials", function () {
        const login = new LoginPage();
        login.navigate();
        login.login_username('admin');
        login.login_pswd('init');
        login.login_click();
        
});

    it("Navigation Bar", function(){
        const ntab = new NavTabs();
        ntab.gotoTab("Keywords");
        cy.url().should('contain', 'http://localhost:8080/#/root/functions')
        ntab.gotoTab("Parameters");
        cy.url().should('contain', 'http://localhost:8080/#/root/parameters')
        ntab.gotoTab("Executions");
        cy.url().should('contain', 'http://localhost:8080/#/root/executions')
        ntab.gotoTab("Scheduler");
        cy.url().should('contain', 'http://localhost:8080/#/root/schedular')
        ntab.gotoTab("Grid");
        cy.url().should('contain', 'http://localhost:8080/#/root/grid')
        ntab.gotoTab("Admin");
        cy.url().should('contain', 'http://localhost:8080/#/root/admin')

});
