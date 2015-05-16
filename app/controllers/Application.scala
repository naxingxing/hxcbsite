package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def testindex = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  def index = Action {
    Ok(views.html.base(views.html.partialindex()))
  }

  def contactus = Action {
    Ok(views.html.base(views.html.partialcontactus()))
  }
  
  def notfound = Action {
    Ok(views.html.base(views.html.partial404()))
  }
  
  def aboutus = Action {
    Ok(views.html.base(views.html.partialaboutus()))
  }
  
  def portfolio = Action {
    Ok(views.html.base(views.html.partialportfolio()))
  }
  
  def services = Action {
    Ok(views.html.base(views.html.partialservices()))
  }
  
  def product1 = Action {
    Ok(views.html.base(views.html.partialproduct1()))
  }
  def product2 = Action {
	  Ok(views.html.base(views.html.partialproduct2()))
  }
  def product3 = Action {
	  Ok(views.html.base(views.html.partialproduct3()))
  }
  def product4 = Action {
	  Ok(views.html.base(views.html.partialproduct4()))
  }
  def product5 = Action {
	  Ok(views.html.base(views.html.partialproduct5()))
  }
  def product6 = Action {
	  Ok(views.html.base(views.html.partialproduct6()))
  }
  
}