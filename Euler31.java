public class Euler31
{
	public static void main(String[] args)
	{
		int result = 0;
		int target = 200;
		int[] m = { 1, 2, 5, 10, 20, 50, 100 };
		int[] i = { 0, 0, 0, 0, 0, 0, 0 };
		int[] n = { 0, 0, 0, 0, 0, 0, 0 };

		while( true )
		{
			n[6] = m[6]*i[6];

			if( n[6] > target )
			{
				break;
			}

			while( true )
			{
				n[5] = n[6] + m[5]*i[5];

				if( n[5] > target )
				{
					break;
				}

				while( true )
				{
					n[4] = n[5] + m[4]*i[4];

					if( n[4] > target )
					{
						break;
					}

					while( true )
					{
						n[3] = n[4] + m[3]*i[3];

						if( n[3] > target )
						{
							break;
						}

						while( true )
						{
							n[2] = n[3] + m[2]*i[2];

							if( n[2] > target )
							{
								break;
							}

							while( true )
							{
								n[1] = n[2] + m[1]*i[1];

								if( n[1] > target )
								{
									break;
								}

								while( true )
								{
									n[0] = n[1] + m[0]*i[0];

									if( n[0] > target )
									{
										break;
									}
									else if( n[0] == target )
									{
										result++;
										break;
									}

									i[0]++;
								}

								i[1]++;
								i[0]=0;
							}

							i[2]++;
							i[1]=i[0]=0;
						}

						i[3]++;
						i[2]=i[1]=i[0]=0;
					}

					i[4]++;
					i[3]=i[2]=i[1]=i[0]=0;
				}

				i[5]++;
				i[4]=i[3]=i[2]=i[1]=i[0]=0;
			}

			i[6]++;
			i[5]=i[4]=i[3]=i[2]=i[1]=i[0]=0;
		}

		result++;

		System.out.println( result );
	}
}