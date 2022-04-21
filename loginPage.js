/// <reference types="cypress" />
class LoginPage{
    navigate() {
        cy.visit('http://localhost:8080/#/root/plans')
    }

    login_username(username){
        cy.get('[name=username]').clear()
        cy.get('[name=username]').type(username);
        return this
    
    }
    login_pswd(pswd){
        cy.get('[name=password]').clear()
        cy.get('[name=password]').type(pswd);
        return this
    
    }
    login_click(){
        cy.get('[type=submit]').click()
        return this
    }
}
export default LoginPage