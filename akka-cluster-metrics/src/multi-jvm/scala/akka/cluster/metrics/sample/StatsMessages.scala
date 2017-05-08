package akka.cluster.metrics.sample

//#messages
final case class StatsJob(text: String)
final case class StatsResult(meanWordLength: Double)
final case class JobFailed(reason: String)
//#messages
