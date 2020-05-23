package typings.zui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maxfilesize extends js.Object {
  var max_file_size: js.UndefOr[String] = js.undefined
  var mime_type: js.Array[Extensions]
  var prevent_duplicates: js.UndefOr[String] = js.undefined
}

object Maxfilesize {
  @scala.inline
  def apply(mime_type: js.Array[Extensions], max_file_size: String = null, prevent_duplicates: String = null): Maxfilesize = {
    val __obj = js.Dynamic.literal(mime_type = mime_type.asInstanceOf[js.Any])
    if (max_file_size != null) __obj.updateDynamic("max_file_size")(max_file_size.asInstanceOf[js.Any])
    if (prevent_duplicates != null) __obj.updateDynamic("prevent_duplicates")(prevent_duplicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maxfilesize]
  }
}

