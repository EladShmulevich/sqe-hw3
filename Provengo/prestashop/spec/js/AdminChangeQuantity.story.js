/* @provengo summon selenium */




/**
 * This story opens a new browser window, goes to prestashop admin login, admin changes white shirt small size quantity to 1.
 */
story('admin changes product quantity to 1', function () {


  let session = new SeleniumSession().start('http://localhost/prestashop/admin365vadiyd/index.php?controller=AdminLogin&token=2f965c7cf586b7ef0c919f1c25709aa0');

  session.adminLogin({username: 'eladshmu@post.bgu.ac.il', password : '12345678'});
  session.changeQuantity();

})