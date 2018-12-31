package typings
package zeroclipboardLib.ZCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardEvent extends js.Object {
  var client: js.UndefOr[ZeroClipboardClient] = js.undefined
  var currentTarget: stdLib.HTMLObjectElement
  var relatedTarget: stdLib.HTMLElement
  var target: stdLib.HTMLElement
  var timeStamp: scala.Double
  var `type`: java.lang.String
}

