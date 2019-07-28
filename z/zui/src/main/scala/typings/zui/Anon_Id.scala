package typings.zui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var lastModifiedDate: js.UndefOr[Date] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var origSize: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(
    id: String = null,
    lastModifiedDate: Date = null,
    name: String = null,
    origSize: String = null,
    size: String = null,
    `type`: String = null
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

