package md5add983d033a7bfeb62f566a361f74582;


public class RecyclerViewFragment_SimpleRecyclerAdapter_SimpleViewHolder
	extends android.support.v7.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("StickyHeaderSample.RecyclerViewFragment/SimpleRecyclerAdapter/SimpleViewHolder, StickyHeaderSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", RecyclerViewFragment_SimpleRecyclerAdapter_SimpleViewHolder.class, __md_methods);
	}


	public RecyclerViewFragment_SimpleRecyclerAdapter_SimpleViewHolder (android.view.View p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == RecyclerViewFragment_SimpleRecyclerAdapter_SimpleViewHolder.class)
			mono.android.TypeManager.Activate ("StickyHeaderSample.RecyclerViewFragment/SimpleRecyclerAdapter/SimpleViewHolder, StickyHeaderSample, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Views.View, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
