package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Maxfilesize extends js.Object {
  var max_file_size: js.UndefOr[String] = js.undefined
  var mime_type: js.Array[Anon_Extensions]
  var prevent_duplicates: js.UndefOr[String] = js.undefined
}

object Anon_Maxfilesize {
  @scala.inline
  def apply(
    mime_type: js.Array[Anon_Extensions],
    max_file_size: String = null,
    prevent_duplicates: String = null
  ): Anon_Maxfilesize = {
    val __obj = js.Dynamic.literal(mime_type = mime_type)
    if (max_file_size != null) __obj.updateDynamic("max_file_size")(max_file_size)
    if (prevent_duplicates != null) __obj.updateDynamic("prevent_duplicates")(prevent_duplicates)
    __obj.asInstanceOf[Anon_Maxfilesize]
  }
}

