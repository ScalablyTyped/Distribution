package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zetapushDashJsLib {
  type AsyncMacroServicePublisher = js.Function4[
    /* method */ java.lang.String, 
    /* parameters */ js.UndefOr[js.Any], 
    /* hardFail */ js.UndefOr[scala.Boolean], 
    /* debug */ js.UndefOr[scala.Double], 
    stdLib.Promise[js.Any]
  ]
  type AuthenticationCallback = js.Function0[js.Any]
  type ConnectionStatusHandler = scala.Double
  type MacroServicePublisher = js.Function4[
    /* method */ java.lang.String, 
    /* parameters */ js.UndefOr[js.Any], 
    /* hardFail */ js.UndefOr[scala.Boolean], 
    /* debug */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  type ServicePublisher = js.Function2[/* method */ java.lang.String, /* parameters */ js.Any, scala.Unit]
}
