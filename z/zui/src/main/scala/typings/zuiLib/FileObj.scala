package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileObj extends js.Object {
  var ext: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var isImage: js.UndefOr[scala.Boolean] = js.undefined
  var lastModifiedDate: js.UndefOr[stdLib.Date] = js.undefined
  var loaded: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var origSize: js.UndefOr[scala.Double] = js.undefined
  var percent: js.UndefOr[scala.Double] = js.undefined
  var previewImage: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var status: js.UndefOr[STATUS] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  def destroy(): scala.Unit
  def getNative(): stdLib.File
}

object FileObj {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    getNative: js.Function0[stdLib.File],
    ext: java.lang.String = null,
    id: java.lang.String = null,
    isImage: js.UndefOr[scala.Boolean] = js.undefined,
    lastModifiedDate: stdLib.Date = null,
    loaded: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    origSize: scala.Int | scala.Double = null,
    percent: scala.Int | scala.Double = null,
    previewImage: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    status: STATUS = null,
    `type`: java.lang.String = null
  ): FileObj = {
    val __obj = js.Dynamic.literal(destroy = destroy, getNative = getNative)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isImage)) __obj.updateDynamic("isImage")(isImage)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    if (loaded != null) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (origSize != null) __obj.updateDynamic("origSize")(origSize.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (previewImage != null) __obj.updateDynamic("previewImage")(previewImage)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FileObj]
  }
}

