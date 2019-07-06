package typings
package zchatDashBrowserLib.zchatDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentMetadata extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object AttachmentMetadata {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): AttachmentMetadata = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[AttachmentMetadata]
  }
}

