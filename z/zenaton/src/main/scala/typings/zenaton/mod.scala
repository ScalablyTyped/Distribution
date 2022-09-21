package typings.zenaton

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zenaton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("zenaton", "Client")
  @js.native
  open class Client protected () extends StObject {
    def this(args: Any*) = this()
    
    def findWorkflow(args: Any*): Any = js.native
    
    def getAppEnv(args: Any*): Any = js.native
    
    def getBodyForTask(args: Any*): Any = js.native
    
    def getBodyForWorkflow(args: Any*): Any = js.native
    
    def getWebsiteUrl(args: Any*): Any = js.native
    
    def getWorkerUrl(args: Any*): Any = js.native
    
    def getWorkerUrlNew(args: Any*): Any = js.native
    
    def killWorkflow(args: Any*): Any = js.native
    
    def mustBeScheduled(args: Any*): Any = js.native
    
    def pauseWorkflow(args: Any*): Any = js.native
    
    def resumeWorkflow(args: Any*): Any = js.native
    
    def sendEvent(args: Any*): Any = js.native
    
    def sendEventByInstanceId(args: Any*): Any = js.native
    
    def startInstantTask(args: Any*): Any = js.native
    
    def startInstantWorkflow(args: Any*): Any = js.native
    
    def startScheduledTask(args: Any*): Any = js.native
    
    def startScheduledWorkflow(args: Any*): Any = js.native
    
    def startTask(args: Any*): Any = js.native
    
    def startWorkflow(args: Any*): Any = js.native
    
    def updateInstance(args: Any*): Any = js.native
  }
  /* static members */
  object Client {
    
    @JSImport("zenaton", "Client")
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  }
  
  @JSImport("zenaton", "Engine")
  @js.native
  open class Engine protected () extends StObject {
    def this(args: Any*) = this()
    
    def checkArguments(args: Any*): Any = js.native
    
    def dispatch(args: Any*): Any = js.native
    
    def execute(args: Any*): Any = js.native
    
    def getInstanceId(args: Any*): Any = js.native
    
    def isTask(args: Any*): Any = js.native
    
    def isWorkflow(args: Any*): Any = js.native
    
    def setProcessor(args: Any*): Any = js.native
  }
  
  object Errors {
    
    object EnvironmentNotSetError {
      
      inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
      
      @JSImport("zenaton", "Errors.EnvironmentNotSetError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def captureStackTrace(p0: Any, p1: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("zenaton", "Errors.EnvironmentNotSetError.stackTraceLimit")
      @js.native
      val stackTraceLimit: Double = js.native
    }
    
    object ExternalZenatonError {
      
      inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
      
      @JSImport("zenaton", "Errors.ExternalZenatonError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def captureStackTrace(p0: Any, p1: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("zenaton", "Errors.ExternalZenatonError.stackTraceLimit")
      @js.native
      val stackTraceLimit: Double = js.native
    }
    
    object InternalZenatonError {
      
      inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
      
      @JSImport("zenaton", "Errors.InternalZenatonError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def captureStackTrace(p0: Any, p1: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("zenaton", "Errors.InternalZenatonError.stackTraceLimit")
      @js.native
      val stackTraceLimit: Double = js.native
    }
    
    object InvalidArgumentError {
      
      inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
      
      @JSImport("zenaton", "Errors.InvalidArgumentError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def captureStackTrace(p0: Any, p1: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("zenaton", "Errors.InvalidArgumentError.stackTraceLimit")
      @js.native
      val stackTraceLimit: Double = js.native
    }
    
    object ModifiedDeciderError {
      
      inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
      
      @JSImport("zenaton", "Errors.ModifiedDeciderError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def captureStackTrace(p0: Any, p1: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("zenaton", "Errors.ModifiedDeciderError.stackTraceLimit")
      @js.native
      val stackTraceLimit: Double = js.native
    }
    
    object ScheduledBoxError {
      
      inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
      
      @JSImport("zenaton", "Errors.ScheduledBoxError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def captureStackTrace(p0: Any, p1: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("zenaton", "Errors.ScheduledBoxError.stackTraceLimit")
      @js.native
      val stackTraceLimit: Double = js.native
    }
    
    object ZenatonError {
      
      inline def apply(args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
      
      @JSImport("zenaton", "Errors.ZenatonError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def captureStackTrace(p0: Any, p1: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("captureStackTrace")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      @JSImport("zenaton", "Errors.ZenatonError.stackTraceLimit")
      @js.native
      val stackTraceLimit: Double = js.native
    }
  }
  
  @JSImport("zenaton", "LastClient")
  @js.native
  open class LastClient protected () extends StObject {
    def this(args: Any*) = this()
    
    def findWorkflow(args: Any*): Any = js.native
    
    def getAppEnv(args: Any*): Any = js.native
    
    def getBodyForTask(args: Any*): Any = js.native
    
    def getBodyForWorkflow(args: Any*): Any = js.native
    
    def getWebsiteUrl(args: Any*): Any = js.native
    
    def getWorkerUrl(args: Any*): Any = js.native
    
    def getWorkerUrlNew(args: Any*): Any = js.native
    
    def killWorkflow(args: Any*): Any = js.native
    
    def mustBeScheduled(args: Any*): Any = js.native
    
    def pauseWorkflow(args: Any*): Any = js.native
    
    def resumeWorkflow(args: Any*): Any = js.native
    
    def sendEvent(args: Any*): Any = js.native
    
    def sendEventByInstanceId(args: Any*): Any = js.native
    
    def startInstantTask(args: Any*): Any = js.native
    
    def startInstantWorkflow(args: Any*): Any = js.native
    
    def startScheduledTask(args: Any*): Any = js.native
    
    def startScheduledWorkflow(args: Any*): Any = js.native
    
    def startTask(args: Any*): Any = js.native
    
    def startWorkflow(args: Any*): Any = js.native
    
    def updateInstance(args: Any*): Any = js.native
  }
  /* static members */
  object LastClient {
    
    @JSImport("zenaton", "LastClient")
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  }
  
  @JSImport("zenaton", "Parallel")
  @js.native
  open class Parallel protected () extends StObject {
    def this(args: Any*) = this()
    
    def dispatch(args: Any*): Any = js.native
    
    def execute(args: Any*): Any = js.native
  }
  
  inline def Task(name: Any, task: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Task")(name.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def Version(name: Any, implementation: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Version")(name.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("zenaton", "Wait")
  @js.native
  open class Wait protected () extends StObject {
    def this(args: Any*) = this()
    
    def at(args: Any*): Any = js.native
    
    def dayOfMonth(args: Any*): Any = js.native
    
    def days(args: Any*): Any = js.native
    
    def friday(args: Any*): Any = js.native
    
    def hours(args: Any*): Any = js.native
    
    def minutes(args: Any*): Any = js.native
    
    def monday(args: Any*): Any = js.native
    
    def months(args: Any*): Any = js.native
    
    def saturday(args: Any*): Any = js.native
    
    def seconds(args: Any*): Any = js.native
    
    def sunday(args: Any*): Any = js.native
    
    def thursday(args: Any*): Any = js.native
    
    def timestamp(args: Any*): Any = js.native
    
    def tuesday(args: Any*): Any = js.native
    
    def wednesday(args: Any*): Any = js.native
    
    def weeks(args: Any*): Any = js.native
    
    def years(args: Any*): Any = js.native
  }
  /* static members */
  object Wait {
    
    @JSImport("zenaton", "Wait")
    @js.native
    val ^ : js.Any = js.native
    
    inline def methods(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("methods")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    inline def timezone(timezone: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("timezone")(timezone.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  inline def Workflow(name: Any, flow: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Workflow")(name.asInstanceOf[js.Any], flow.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  object infos {
    
    @JSImport("zenaton", "infos")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("zenaton", "infos.appVersion")
    @js.native
    def appVersion: String = js.native
    inline def appVersion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(x.asInstanceOf[js.Any])
    
    @JSImport("zenaton", "infos.codePath")
    @js.native
    def codePath: String = js.native
    inline def codePath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codePath")(x.asInstanceOf[js.Any])
  }
  
  object serializer {
    
    @JSImport("zenaton", "serializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("zenaton", "serializer.CURRENT_VERSION")
    @js.native
    val CURRENT_VERSION: String = js.native
    
    inline def decode(data: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def encode(data: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  object taskManager {
    
    @JSImport("zenaton", "taskManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getClass_(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getClass")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    inline def getTask(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTask")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    inline def setClass(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setClass")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  }
  
  object workflowManager {
    
    @JSImport("zenaton", "workflowManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getClass_(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getClass")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    inline def getWorkflow(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkflow")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    inline def setClass(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setClass")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  }
}
