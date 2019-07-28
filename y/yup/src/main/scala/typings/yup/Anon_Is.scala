package typings.yup

import typings.yup.yupMod.WhenOptionsBuilderObjectIs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Is extends js.Object {
  var is: WhenOptionsBuilderObjectIs
  var otherwise: js.Any
  var `then`: js.Any
}

object Anon_Is {
  @scala.inline
  def apply(is: WhenOptionsBuilderObjectIs, otherwise: js.Any, `then`: js.Any): Anon_Is = {
    val __obj = js.Dynamic.literal(is = is.asInstanceOf[js.Any], otherwise = otherwise)
    __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[Anon_Is]
  }
}

