package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var lastModifiedDate: js.UndefOr[stdLib.Date] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var origSize: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    lastModifiedDate: stdLib.Date = null,
    name: java.lang.String = null,
    origSize: java.lang.String = null,
    size: java.lang.String = null,
    `type`: java.lang.String = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    if (name != null) __obj.updateDynamic("name")(name)
    if (origSize != null) __obj.updateDynamic("origSize")(origSize)
    if (size != null) __obj.updateDynamic("size")(size)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Id]
  }
}

