package typings.zchatDashBrowser.zchatDashBrowserMod

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
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[AttachmentMetadata]
  }
}

