package typings
package zchatDashBrowserLib.zchatDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  var metadata: js.UndefOr[AttachmentMetadata] = js.undefined
  var mime_type: java.lang.String
  var name: java.lang.String
  var size: scala.Double
  var url: java.lang.String
}

object Attachment {
  @scala.inline
  def apply(
    mime_type: java.lang.String,
    name: java.lang.String,
    size: scala.Double,
    url: java.lang.String,
    metadata: AttachmentMetadata = null
  ): Attachment = {
    val __obj = js.Dynamic.literal(mime_type = mime_type, name = name, size = size, url = url)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[Attachment]
  }
}

