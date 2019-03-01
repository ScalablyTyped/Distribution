package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extensions extends js.Object {
  var extensions: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Extensions {
  @scala.inline
  def apply(extensions: java.lang.String = null, title: java.lang.String = null): Anon_Extensions = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Extensions]
  }
}

