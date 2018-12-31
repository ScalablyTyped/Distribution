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

