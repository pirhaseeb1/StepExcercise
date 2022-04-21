/// <reference types="cypress" />
class NavTabs{

    gotoTab(tab){
        let text='//a[contains(text(),"' + tab + '")]/..';
        cy.xpath(text).click();
        cy.wait(500);

        // assertions
        cy.xpath(text).should('have.class', 'active'); 
        cy.get('.pagination').find('li').find('a').should('have.attr','disabled', 'disabled');
 
    }

}
export default NavTabs