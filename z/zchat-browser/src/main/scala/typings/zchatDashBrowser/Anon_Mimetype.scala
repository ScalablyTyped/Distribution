package typings.zchatDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mimetype extends js.Object {
  var mime_type: String
  var name: String
  var size: Double
  var url: String
}

object Anon_Mimetype {
  @scala.inline
  def apply(mime_type: String, name: String, size: Double, url: String): Anon_Mimetype = {
    val __obj = js.Dynamic.literal(mime_type = mime_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Mimetype]
  }
}

