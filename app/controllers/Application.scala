package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def day = Action {
    Ok(views.html.dayview("Your new application is ready."))
  }
  
  def week = Action {
    Ok(views.html.weekview("Your new application is ready."))
  }
  
  def month = Action {
    Ok(views.html.monthview("Your new application is ready."))
  }
  
}