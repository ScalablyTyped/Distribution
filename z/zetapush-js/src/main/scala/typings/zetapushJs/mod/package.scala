package typings.zetapushJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.zetapushJs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[String]

type AsyncMacroServicePublisher = js.Function4[
/* method */ String, 
/* parameters */ js.UndefOr[PublishParameters], 
/* hardFail */ js.UndefOr[Boolean], 
/* debug */ js.UndefOr[Double], 
js.Promise[Any]]

type AuthenticationCallback = js.Function0[AbstractHandshake]

type ConnectionStatusHandler = Double

type MacroServicePublisher = js.Function4[
/* method */ String, 
/* parameters */ js.UndefOr[PublishParameters], 
/* hardFail */ js.UndefOr[Boolean], 
/* debug */ js.UndefOr[Double], 
Unit]

type PublishParameters = StringDictionary[Any]

type ServicePublisher = js.Function2[/* method */ String, /* parameters */ Any, Unit]
