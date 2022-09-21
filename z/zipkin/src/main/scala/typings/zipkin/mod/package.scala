package typings.zipkin.mod

import typings.zipkin.anon.Headers
import typings.zipkin.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createNoopTracer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoopTracer")().asInstanceOf[Unit]

inline def randomTraceId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomTraceId")().asInstanceOf[String]

type RequestZipkinHeaders[T, H] = T & Headers[H]
