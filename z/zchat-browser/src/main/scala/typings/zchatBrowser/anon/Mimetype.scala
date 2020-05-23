package typings.zchatBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mimetype extends js.Object {
  var mime_type: String
  var name: String
  var size: Double
  var url: String
}

object Mimetype {
  @scala.inline
  def apply(mime_type: String, name: String, size: Double, url: String): Mimetype = {
    val __obj = js.Dynamic.literal(mime_type = mime_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mimetype]
  }
}

