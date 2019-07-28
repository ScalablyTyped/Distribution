package typings.zetapushDashJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zetapushDashJsMod {
  type AsyncMacroServicePublisher = js.Function4[
    /* method */ String, 
    /* parameters */ js.UndefOr[PublishParameters], 
    /* hardFail */ js.UndefOr[Boolean], 
    /* debug */ js.UndefOr[Double], 
    js.Promise[js.Any]
  ]
  type AuthenticationCallback = js.Function0[AbstractHandshake]
  type MacroServicePublisher = js.Function4[
    /* method */ String, 
    /* parameters */ js.UndefOr[PublishParameters], 
    /* hardFail */ js.UndefOr[Boolean], 
    /* debug */ js.UndefOr[Double], 
    Unit
  ]
  type PublishParameters = StringDictionary[js.Any]
  type ServicePublisher = js.Function2[/* method */ String, /* parameters */ js.Any, Unit]
}
