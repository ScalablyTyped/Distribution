package typings
package zeroclipboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var `type`: java.lang.String
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String): Anon_Name = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Name]
  }
}

