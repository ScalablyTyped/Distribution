package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var token: java.lang.String
}

object Token {
  @scala.inline
  def apply(token: java.lang.String): Token = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Token]
  }
}

