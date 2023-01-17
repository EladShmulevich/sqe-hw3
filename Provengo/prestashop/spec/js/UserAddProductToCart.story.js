/* @provengo summon selenium */

/**
 * This story opens a new browser window, goes to prestashop users login, user login and add white shirt size small quantity 2 to cart.
 */
story('user add a product to cart twice, admin changes quantity to one', function () {
  // the "with" statement makes it redundant to write "s." before each call to a defined event (like the story above)

  let session = new SeleniumSession().start('http://localhost/prestashop/en/login?back=my-account');

  session.userLogin({username: 'idolou1@gmail.com', password : '12345678'})
  session.addProduct();

})