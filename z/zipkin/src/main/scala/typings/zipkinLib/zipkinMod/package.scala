package typings
package zipkinLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zipkinMod {
  type RequestZipkinHeaders[T, H] = T with zipkinLib.Anon_Headers[H]
}
