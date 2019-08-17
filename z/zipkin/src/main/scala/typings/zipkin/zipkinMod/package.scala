package typings.zipkin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zipkinMod {
  import typings.zipkin.Anon_Headers

  type RequestZipkinHeaders[T, H] = T with Anon_Headers[H]
}
