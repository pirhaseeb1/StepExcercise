/// <reference types="cypress" />
class NavTabs{

    gotoTab(tab){
        let text='//a[contains(text(),"' + tab + '")]';
        cy.xpath(text).click();

 
    }

}
export default NavTabs