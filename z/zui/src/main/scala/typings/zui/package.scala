package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zui {
  type ActionFunc = js.Function0[Boolean]
  type CallBack = js.Function0[Unit]
  type OnActionFunc = js.Function3[/* name */ String, /* action */ String, /* messager */ Messager, js.Any]
}
