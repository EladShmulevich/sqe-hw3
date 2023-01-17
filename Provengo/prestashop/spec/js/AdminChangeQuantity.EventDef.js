/* @Provengo summon selenium */



/**
 * The AdminLogin event defines the selenium action for successful admin login
 */
defineEvent(SeleniumSession, "AdminLogin", function(session, e) {

    session.writeText('//*[@id="email"]', e.username)
    session.writeText('//*[@id="passwd"]', e.password)

    session.click('//*[@id="submit_login"]');



})


/**
 * The ChangeQuantity event defines the selenium action for change the quantity of a product
 */
defineEvent(SeleniumSession, "ChangeQuantity", function(session, e) {



    //admin go to catalog page
    session.click("//*[@id=\"quick_select\"]");
    session.click("//*[@id=\"header_quick\"]/div/ul/li[1]/a");

    //click on the shirt product quantity
    session.waitForVisibility("//*[@id=\"product_catalog_list\"]/div[2]/div/div/table/tbody/tr[18]/td[9]/a", 8000);
    session.click("//*[@id=\"product_catalog_list\"]/div[2]/div/div/table/tbody/tr[18]/td[9]/a");

    //change quantity to 1
    session.waitForVisibility("//*[@id=\"attribute_9\"]/td[6]/div/input", 8000);
    session.click("//*[@id=\"attribute_9\"]/td[6]/div/input")
    session.doubleClick("//*[@id=\"attribute_9\"]/td[6]/div/input")
    // session.waitForVisibility("//*[@id=\"attribute_9\"]/td[6]/div/input", 1000);

    session.writeText("//*[@id=\"attribute_9\"]/td[6]/div/input", "1");


    //save changes
    session.click("//*[@id=\"form\"]/div[4]/div[2]/div[2]/button[1]");

})