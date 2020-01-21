package typings.zchatBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentMetadata extends js.Object {
  var height: Double
  var width: Double
}

object AttachmentMetadata {
  @scala.inline
  def apply(height: Double, width: Double): AttachmentMetadata = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttachmentMetadata]
  }
}

