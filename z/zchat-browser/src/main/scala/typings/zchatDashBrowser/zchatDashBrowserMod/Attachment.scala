package typings.zchatDashBrowser.zchatDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  var metadata: js.UndefOr[AttachmentMetadata] = js.undefined
  var mime_type: String
  var name: String
  var size: Double
  var url: String
}

object Attachment {
  @scala.inline
  def apply(mime_type: String, name: String, size: Double, url: String, metadata: AttachmentMetadata = null): Attachment = {
    val __obj = js.Dynamic.literal(mime_type = mime_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
}

