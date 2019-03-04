package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var login: java.lang.String
  var password: java.lang.String
}

object Credentials {
  @scala.inline
  def apply(login: java.lang.String, password: java.lang.String): Credentials = {
    val __obj = js.Dynamic.literal(login = login, password = password)
  
    __obj.asInstanceOf[Credentials]
  }
}

