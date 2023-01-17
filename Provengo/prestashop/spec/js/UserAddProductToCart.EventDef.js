/* @provengo summon selenium */

/**
 * The UserLogin event defines the selenium action for successful user login
 */
defineEvent(SeleniumSession, "UserLogin", function(session, e) {

    session.writeText('/html/body/main/section/div/div/section/div/section/form/div/div[1]/div[1]/input\n', e.username)
    session.writeText('/html/body/main/section/div/div/section/div/section/form/div/div[2]/div[1]/div/input', e.password)
    session.click('/html/body/main/section/div/div/section/div/section/form/footer/button');

})


/**
 * The AddProduct event defines the selenium action for adding product to cart
 */
defineEvent(SeleniumSession, "AddProduct", function(session, e) {
    //user goes to products page
    session.click('//*[@id="_desktop_logo"]/a/img');
    //click on the shirt product
    session.click('/html/body/main/section/div/div/section/section/section/div/div[1]/article/div/div[1]/a/img');
    //increase quantity by 2
    session.click("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[1]/div/span[3]/button[1]/i");
    //add product to cart
    session.click("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/button");
})
