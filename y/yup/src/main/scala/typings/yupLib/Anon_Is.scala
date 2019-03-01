package typings
package yupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Is
  extends yupLib.yupMod._WhenOptions[js.Any] {
  var is: scala.Boolean | (js.Function1[/* value */ js.Any, scala.Boolean])
  var otherwise: js.Any
  var `then`: js.Any
}

object Anon_Is {
  @scala.inline
  def apply(
    is: scala.Boolean | (js.Function1[/* value */ js.Any, scala.Boolean]),
    otherwise: js.Any,
    `then`: js.Any
  ): Anon_Is = {
    val __obj = js.Dynamic.literal(`then` = `then`)
    __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    __obj.updateDynamic("otherwise")(otherwise)
    __obj.asInstanceOf[Anon_Is]
  }
}

