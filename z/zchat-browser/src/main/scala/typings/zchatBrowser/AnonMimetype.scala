package typings.zchatBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMimetype extends js.Object {
  var mime_type: String
  var name: String
  var size: Double
  var url: String
}

object AnonMimetype {
  @scala.inline
  def apply(mime_type: String, name: String, size: Double, url: String): AnonMimetype = {
    val __obj = js.Dynamic.literal(mime_type = mime_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMimetype]
  }
}

