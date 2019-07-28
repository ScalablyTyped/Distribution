package typings.zipkin

import typings.zipkin.Anon_Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zipkinMod {
  type RequestZipkinHeaders[T, H] = T with Anon_Headers[H]
}
