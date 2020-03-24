package jenkins.branch.buildstrategies.basic;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;

public abstract class CommitterFilter extends AbstractDescribableImpl<CommitterFilter> {

    public abstract boolean isMatch(@NonNull String committer);

    public static abstract class NameFilterDescriptor extends Descriptor<NamedBranchBuildStrategyImpl.NameFilter> {

    }
}