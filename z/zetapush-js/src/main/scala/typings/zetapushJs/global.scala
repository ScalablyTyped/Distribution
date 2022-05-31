package typings.zetapushJs

import typings.zetapushJs.mod.AbstractAuthData
import typings.zetapushJs.mod.AsyncMacroServicePublisher
import typings.zetapushJs.mod.ClientOptions
import typings.zetapushJs.mod.CredentialsAuthData
import typings.zetapushJs.mod.CredentialsHandshake
import typings.zetapushJs.mod.SmartClientOptions
import typings.zetapushJs.mod.TokenAuthData
import typings.zetapushJs.mod.TokenHandshake
import typings.zetapushJs.mod.WeakClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ZetaPush {
    
    @JSGlobal("ZetaPush.Authentication")
    @js.native
    class Authentication ()
      extends typings.zetapushJs.mod.Authentication
    /* static members */
    object Authentication {
      
      @JSGlobal("ZetaPush.Authentication")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(authData: AbstractAuthData): CredentialsHandshake | TokenHandshake = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(authData.asInstanceOf[js.Any]).asInstanceOf[CredentialsHandshake | TokenHandshake]
      
      inline def delegating(authData: TokenAuthData): TokenHandshake = ^.asInstanceOf[js.Dynamic].applyDynamic("delegating")(authData.asInstanceOf[js.Any]).asInstanceOf[TokenHandshake]
      
      inline def simple(authData: CredentialsAuthData): CredentialsHandshake = ^.asInstanceOf[js.Dynamic].applyDynamic("simple")(authData.asInstanceOf[js.Any]).asInstanceOf[CredentialsHandshake]
      
      inline def weak(authData: TokenAuthData): TokenHandshake = ^.asInstanceOf[js.Dynamic].applyDynamic("weak")(authData.asInstanceOf[js.Any]).asInstanceOf[TokenHandshake]
    }
    
    @JSGlobal("ZetaPush.Client")
    @js.native
    class Client protected ()
      extends typings.zetapushJs.mod.Client {
      def this(options: ClientOptions) = this()
    }
    
    @JSGlobal("ZetaPush.SmartClient")
    @js.native
    class SmartClient protected ()
      extends typings.zetapushJs.mod.SmartClient {
      def this(options: SmartClientOptions) = this()
    }
    
    @JSGlobal("ZetaPush.VERSION")
    @js.native
    val VERSION: String = js.native
    
    @JSGlobal("ZetaPush.WeakClient")
    @js.native
    class WeakClient protected ()
      extends typings.zetapushJs.mod.WeakClient {
      def this(options: WeakClientOptions) = this()
    }
    
    object services {
      
      @JSGlobal("ZetaPush.services.Macro")
      @js.native
      class Macro protected ()
        extends typings.zetapushJs.mod.services.Macro {
        def this($publish: AsyncMacroServicePublisher) = this()
      }
      object Macro {
        
        @JSGlobal("ZetaPush.services.Macro")
        @js.native
        val ^ : js.Any = js.native
        
        /* static member */
        @JSGlobal("ZetaPush.services.Macro.DEFAULT_DEPLOYMENT_ID")
        @js.native
        def DEFAULT_DEPLOYMENT_ID: String = js.native
        inline def DEFAULT_DEPLOYMENT_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_DEPLOYMENT_ID")(x.asInstanceOf[js.Any])
      }
    }
  }
}
