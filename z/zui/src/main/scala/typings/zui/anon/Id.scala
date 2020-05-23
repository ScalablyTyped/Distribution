package typings.zui.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var lastModifiedDate: js.UndefOr[Date] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var origSize: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Id {
  @scala.inline
  def apply(
    id: String = null,
    lastModifiedDate: Date = null,
    name: String = null,
    origSize: String = null,
    size: String = null,
    `type`: String = null
  ): Id = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (origSize != null) __obj.updateDynamic("origSize")(origSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

