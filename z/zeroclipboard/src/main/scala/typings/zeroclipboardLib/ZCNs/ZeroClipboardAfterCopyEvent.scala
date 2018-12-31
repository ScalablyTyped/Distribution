package typings
package zeroclipboardLib.ZCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardAfterCopyEvent extends ZeroClipboardEvent {
  var data: Dictionary[java.lang.String]
  var errors: js.Array[_]
  var success: Dictionary[scala.Boolean]
}

