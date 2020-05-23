package typings.zui

import typings.std.Date
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileObj extends js.Object {
  var ext: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isImage: js.UndefOr[Boolean] = js.undefined
  var lastModifiedDate: js.UndefOr[Date] = js.undefined
  var loaded: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var origSize: js.UndefOr[Double] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var previewImage: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var status: js.UndefOr[STATUS] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  def destroy(): Unit
  def getNative(): File
}

object FileObj {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getNative: () => File,
    ext: String = null,
    id: String = null,
    isImage: js.UndefOr[Boolean] = js.undefined,
    lastModifiedDate: Date = null,
    loaded: js.UndefOr[Double] = js.undefined,
    name: String = null,
    origSize: js.UndefOr[Double] = js.undefined,
    percent: js.UndefOr[Double] = js.undefined,
    previewImage: String = null,
    size: js.UndefOr[Double] = js.undefined,
    status: STATUS = null,
    `type`: String = null
  ): FileObj = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getNative = js.Any.fromFunction0(getNative))
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isImage)) __obj.updateDynamic("isImage")(isImage.get.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(origSize)) __obj.updateDynamic("origSize")(origSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    if (previewImage != null) __obj.updateDynamic("previewImage")(previewImage.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileObj]
  }
}

