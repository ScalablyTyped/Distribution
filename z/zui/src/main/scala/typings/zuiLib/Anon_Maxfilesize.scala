package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Maxfilesize extends js.Object {
  var max_file_size: js.UndefOr[java.lang.String] = js.undefined
  var mime_type: js.Array[Anon_Extensions]
  var prevent_duplicates: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Maxfilesize {
  @scala.inline
  def apply(
    mime_type: js.Array[Anon_Extensions],
    max_file_size: java.lang.String = null,
    prevent_duplicates: java.lang.String = null
  ): Anon_Maxfilesize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mime_type")(mime_type)
    if (max_file_size != null) __obj.updateDynamic("max_file_size")(max_file_size)
    if (prevent_duplicates != null) __obj.updateDynamic("prevent_duplicates")(prevent_duplicates)
    __obj.asInstanceOf[Anon_Maxfilesize]
  }
}

